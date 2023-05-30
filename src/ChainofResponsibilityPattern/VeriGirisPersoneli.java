
package ChainofResponsibilityPattern;

public class VeriGirisPersoneli extends Employee{

    @Override
    public void ProcessRequest(HospitalStaff req) { if(req.positionToBeApproved.equals("Veri Giriş Personeli"))
        {
            System.out.println("Veri giriş personelindesiniz." );
            
        }else if (NextApprover != null)
        {
            System.out.println("Veri giriş personelindesiniz.Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");
 
        }   }

    
}
