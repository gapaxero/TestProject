package testJackson.POJO;

import testJackson.JsonTool;

public class MFB28900OUT {
	public String rc = "M000";
	public String rc2 = "M000";
	public String msg = "";
	public String msg2 = "";
	
	public MFB28900result result = null;
	
	public static class MFB28900result {
		public String txn = "123456";
		public MFB28900data data = null;
	}
	
	public static class MFB28900data {
		public MFB28900TB74 TB74 = null;
	}
	
	public static class MFB28900TB74 {
		public String Account1   = "032507621598";// 帳號
		public String Ctid       = "100123";// 存單字號
		public String Currency1  = "01";// 存單幣別
		public String Period     = "12";// 存單期間
		public String PeriodType = "1";// 期間型態
		public String Rate       = "0.68";// 存單利率
		public String BeginDate  = "1100203";// 存單起息日
		public String EndDate    = "1110805";// 存單到期日
		public String CancelDate = "1100808";// 中途解約日期
		public String Balance1   = "123456";// 存單本金餘額 (原幣)
		public String Fee        = "0.0";// 利息金額 (原幣)
		public String WTAX       = "AA";// 代扣稅款 (原幣)
		public String Payment    = "0.0";// 淨付金額 (原幣)
		public String Flg        = "0";// 是否當日入扣帳註記
		public String Account2   = "02501359752";// 存入外幣活期帳號
		public String Currency2  = "01";// 存入幣別
		public String Balance2   = "1000000";// 活存餘額
	}
	
	@Override
	public String toString() {
		return JsonTool.printStrJson(this);
	}

}
