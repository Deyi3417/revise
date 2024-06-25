package deyi.com.revise.project;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class MultiThreadExample {

    private static final int MODULE_COUNT = 5;
    private static List<Module> modules = new ArrayList<>();
    private static final CountDownLatch latch = new CountDownLatch(MODULE_COUNT);
    private static final Box box = new Box();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(MODULE_COUNT);

        // 启动5个模块线程
        for (int i = 0; i < MODULE_COUNT; i++) {
            int moduleId = i;
            Module module = new Module(moduleId);
            modules.add(module);
            executorService.submit(() -> {
                module.run();
                latch.countDown();
            });
        }

//        等待所有模块线程都准备好
        latch.await();
//        for (int i = 0; i < MODULE_COUNT; i++) {
//            int moduleId = i;
//            Module module = new Module(moduleId);
//            modules.add(module);
//            module.run();
//        }

        System.out.println("前：" + JSON.toJSONString(modules));
        List<Module> collect = modules.stream().filter(e -> !e.isFaulty()).collect(Collectors.toList());
        modules = collect;
        System.out.println("后：" + JSON.toJSONString(modules));

        // 通过Box调整温度
        adjustTemperature(box, modules);

        // 更新模块状态并执行后续工作
        updateModuleStatus(modules, executorService);

        executorService.shutdown();

        System.out.println("所有操作完成");
    }

    private static void adjustTemperature(Box box, List<Module> modules) {
        System.out.println("通过Box调整温度");
        boolean adjustmentSuccessful = box.adjustTemperature();
        for (Module module : modules) {
            module.setTemperatureAdjusted(adjustmentSuccessful);
        }
        System.out.println("adjustTemperature 温箱温度调整完成");
    }

    private static void updateModuleStatus(List<Module> modules, ExecutorService executorService) {
        for (Module module : modules) {
            if (module.isFaulty() || !module.isTemperatureAdjusted()) {
                System.out.println("模块 " + module.getId() + " 有异常或温度调整失败，后续工作终止");
            } else {
                module.setStatus("成功");
                // 提交后续工作的线程
                // executorService.submit(module::executeNextStep);
                module.executeNextStep();
            }
        }
    }
}

class Module {
    private final int id;
    private boolean faulty = false;
    private boolean temperatureAdjusted = false;
    private String status = "未开始";

    public Module(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("模块 " + id + " 正在运行");
        try {
            Thread.sleep(2000); // 模拟模块运行时间
            if (Math.random() < 0.2) { // 模拟20%的故障率
                faulty = true;
                status = "失败";
                System.out.println("模块 " + id + " 运行异常");
            } else {
                status = "准备好";
                System.out.println("模块 " + id + " 运行完成");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void executeNextStep() {
        System.out.println("模块 " + id + " 正在执行后续工作");
        try {
            Thread.sleep(1000); // 模拟后续工作时间
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("模块 " + id + " 后续工作完成");
    }

    public int getId() {
        return id;
    }

    public boolean isFaulty() {
        return faulty;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isTemperatureAdjusted() {
        return temperatureAdjusted;
    }

    public void setTemperatureAdjusted(boolean temperatureAdjusted) {
        this.temperatureAdjusted = temperatureAdjusted;
    }
}

class Box {
    public boolean adjustTemperature() {
        System.out.println("温箱正在调整温度");
        try {
            Thread.sleep(2000); // 模拟温度调整时间
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
        System.out.println("box 温箱温度调整完成");
        return true; // 模拟温度调整成功
    }
}
