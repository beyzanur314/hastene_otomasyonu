
package ChainofResponsibilityPattern;


public class İdariPersonel extends Employee {

    @Override
    public void ProcessRequest(HospitalStaff req) {
        if (req.positionToBeApproved.equals("İdari Personel")) {
            System.out.println("İdari Personeldesiniz.");
        } else if (NextApprover != null) {
            System.out.println("İdari Personeldesiniz Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");

        }
    }

}
