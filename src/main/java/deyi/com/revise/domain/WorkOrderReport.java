package deyi.com.revise.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * <p>
 * 工单报工信息
 * </p>
 *
 * @author space-x-team
 * @since 2021-03-16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WorkOrderReport {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String aufnr;

    private String matnr;

    private String maktx;

    private Double gamng;

    private String steus;

    private String vornr;

    private String arbpl;

    private String ltxa1;

    private String ktext;

    private String gxsta;

    private String ghName;

    private Date ersda;

    private Date updateTime;

    private String reportTime;

    private Double ism02;

    private String ablad;
}