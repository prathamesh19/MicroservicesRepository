package in.nareshit.raghu.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.nareshit.raghu.model.Vendor;

@FeignClient("VENDOR-SERVICE")
public interface VendorRestConsumer {

	@GetMapping("/vendor/msg")
	public ResponseEntity<String> showMsg() ;
	
	@GetMapping("/vendor/obj")
	public ResponseEntity<Vendor> showMsgB();
	
	@GetMapping("/vendor/input/{id}")
	public ResponseEntity<String> showMsgC(@PathVariable("id") Integer id) ;
	
	@GetMapping("/vendor/list")
	public ResponseEntity<List<Vendor>> showMsgD();
	
	@PostMapping("/vendor/create")
	public ResponseEntity<String> saveVendor(
			@RequestBody Vendor vendor);
<<<<<<< HEAD:FeignClient/SpringCloudFCProduct/src/main/java/in/nareshit/raghu/consumer/VendorRestConsumer.java
=======
	
	@DeleteMapping("/vendor/remove/{id}")
	public String removeVendor(
			@PathVariable Integer id);
	
	@PutMapping("/vendor/modified")
	public ResponseEntity<String> updateVendor(
			@RequestBody Vendor vendor);
>>>>>>> 3e3c0db0e4de295781cccd89e8155703ade31e2f:SpringCloudFCProduct/src/main/java/in/nareshit/raghu/consumer/VendorRestConsumer.java
	
	@DeleteMapping("/vendor/remove/{id}")
	public String removeVendor(
			@PathVariable Integer id);
	
	@PutMapping("/vendor/modified")
	public ResponseEntity<String> updateVendor(
			@RequestBody Vendor vendor);
}
