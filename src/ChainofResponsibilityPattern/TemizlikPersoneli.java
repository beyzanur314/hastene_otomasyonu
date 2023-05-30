
package ChainofResponsibilityPattern;


public class TemizlikPersoneli extends Employee{

    @Override
    public void ProcessRequest(HospitalStaff req) { if(req.positionToBeApproved.equals("Temizlik Personeli"))
        {
            System.out.println("Temizlik Personelindesiniz." );
            
        }else if (NextApprover != null)
        {
            System.out.println("Temizlik Personelindesiniz Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");
 
        }}

}
