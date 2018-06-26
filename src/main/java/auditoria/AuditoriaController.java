package auditoria;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditoriaController {
	
	@PostMapping("/v1/log")    
	public ResponseEntity<?> gravaLog(@RequestBody Log log) {
		
		if(log!=null) {	   	
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		    	
    }

}
