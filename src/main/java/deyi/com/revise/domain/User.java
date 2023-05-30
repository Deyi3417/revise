package deyi.com.revise.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : HP
 * @date : 2023/3/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -8669010565625207339L;

    private Integer id;

    private String userName;

    private Integer age;

    private Integer gender;

    private int sort;
}
