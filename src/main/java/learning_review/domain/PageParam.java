package learning_review.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : HP
 * @date : 2023/2/3
 */
@Data
public class PageParam implements Serializable {

    private static final long serialVersionUID = -3841739098399987348L;

    private Integer current;

    private Integer size;

}
