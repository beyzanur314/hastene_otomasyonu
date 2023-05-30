
package ChainofResponsibilityPattern;

public class SaglikPersoneli extends Employee{

    @Override
    public void ProcessRequest(HospitalStaff req) {
         if(req.positionToBeApproved.equals("Sağlık Personeli"))
        {
            System.out.println("Sağlık Personelindesiniz " );
            
        }else if (NextApprover != null)
        {
            System.out.println("Sağlık Personelindesiniz Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");
 
        }   }

    
}
