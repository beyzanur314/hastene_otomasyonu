
package ChainofResponsibilityPattern;


public class GuvenlikPersoneli extends Employee{

    @Override
    public void ProcessRequest(HospitalStaff req) {
    
         if(req.positionToBeApproved.equals("Güvenlik Personeli"))
        {
            System.out.println("Güvenlik Personelindesiniz" );
            
        }else if (NextApprover != null)
        {
            System.out.println("Güvenlik Personelindesiniz Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");
 
        }
        
    }

}
