package ma.emsi.hospital.web;

import lombok.AllArgsConstructor;
import ma.emsi.hospital.entities.Patient;
import ma.emsi.hospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/index")
    public String patients(Model model){
        List<Patient> patients=patientRepository.findAll();
        model.addAttribute("listPatients",patients);
        return "vue";
    }

}
