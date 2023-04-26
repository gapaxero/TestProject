package rpg;

public class Games {

	public static void main(String[] args) {
		RoleProperty GetProperty = new RoleProperty();
		RoleEthnicityAndProfession GetRoleEthnicityAndProfession = new RoleEthnicityAndProfession();
		GetRoleEthnicityAndProfession.SelectEthnicity();
		GetRoleEthnicityAndProfession.SelectProfession();
		GetRoleEthnicityAndProfession.PrintResult();
		GetProperty.SetProfessionProperty(GetRoleEthnicityAndProfession.GetProfession());
		GetProperty.ShowPlayerProperty();
		
		RoleProperty w =new Warrior();
		
		

	}

}
