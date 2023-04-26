package functionTest;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 1091522
 * @Description
 */
@Data
public class ckEntity {

    private String uuid;

    private String sid;

    private String status;

    private String lockEmpid = "";

    private LocalDateTime applyDateTime;

    private ckB businessType;

    private ck kind;

    private String problemFlag = "0";

    private String auditFlow = "";

}
