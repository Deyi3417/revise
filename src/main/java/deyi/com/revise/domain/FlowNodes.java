package deyi.com.revise.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : HP
 * @date : 2023/6/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowNodes implements Serializable {

    private static final long serialVersionUID = -6101802293700185817L;

    private String nodeCode;

    private String nodeName;
}
