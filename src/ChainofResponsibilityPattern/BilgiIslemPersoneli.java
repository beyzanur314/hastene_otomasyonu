
package ChainofResponsibilityPattern;

public class BilgiIslemPersoneli extends Employee{

    @Override
    public void ProcessRequest(HospitalStaff req) {
    
        if(req.positionToBeApproved.equals("Bilgi İşlem Personeli"))
        {
            System.out.println("Hasta sırası: " + req.patientId + "\n"+
                                "Doktor adı: " + req.doctorName + "\n"+
                                "Randevu saati:" + req.appointmentTime + "\n"+
                    "Bilgilerine sahip Randevunuz Onaylanmıştır.");
        }else
        {
            System.out.println("Randevunuz onaylanmamıştır.");
        }
        
    }

    
}
