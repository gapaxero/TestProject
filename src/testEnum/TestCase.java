package testEnum;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TestCase {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("888501816059"); list.add("888401816051"); list.add("888771816054");

		list = list.stream()
				   .filter(acct -> acct.startsWith("50", 3))
				   .collect(Collectors.toList());

		System.out.println(list);

	}

	public static Collection<Case_Kinds> getApplyCaseKind(Case_Kinds... caseKind) {
		Collection<Case_Kinds> reslist = null;
		System.out.println(Arrays.toString(caseKind));
		if(caseKind.length == 0) {
			reslist = Arrays.stream(Case_Kinds.values())
					        .filter(kind -> !Case_Kinds.FTAO.equals(kind))
					        .filter(kind -> !Case_Kinds.FUNDAO.equals(kind))
					        .collect(Collectors.toList());
		} else if(caseKind.length == 1) {
			reslist = Arrays.stream(Case_Kinds.values())
                            .filter(kind -> kind.equals(caseKind[0]))
                            .collect(Collectors.toList());
		}

		return reslist;
	}

	public static boolean checkAuditCase(String status) {
		return status.startsWith("0B") && !status.equals("0B0D0") && !status.equals("0B012") && !status.equals("0B0C0");
	}

	private static void setAuditFlowByKind(CaseEntitys entity,Case_Kinds kind) {
    	switch (kind) {
		case Super: case FUND:
			entity.setAuditFlow("FundNormal"); break;
		case SEC: case Normal:
			entity.setAuditFlow("Normal"); break;
		case FTAO:
			entity.setAuditFlow("AONormal"); break;
		case FUNDAO:
			entity.setAuditFlow("FundAONormal"); break;
		default:
			entity.setAuditFlow("undefind"); break;
		}
    }

	public enum Case_Kinds {
		Super, // 台外幣 + 基金 + 證券
		FUND, // 台外幣 + 基金
		SEC, // 台外幣 + 證券
		Normal, // 台外幣
		FTAO, // 外幣加開
		FUNDAO // 基金加開
	}
}

@Data
class CaseEntitys {
	private String auditFlow;
	private String uuid;
}


