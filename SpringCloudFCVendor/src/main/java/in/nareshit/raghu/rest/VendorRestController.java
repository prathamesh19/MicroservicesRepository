package in.nareshit.raghu.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.model.Vendor;

@RestController
@RequestMapping("/vendor")
public class VendorRestController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/msg")
	public ResponseEntity<String> showMsg() {
		return ResponseEntity.ok("WELCOME TO VENDOR!" + port);
	}
	
	@GetMapping("/obj")
	public ResponseEntity<Vendor> showMsgB() {
		return ResponseEntity.ok(new Vendor(10,"A","HYD"));
	}
	
	@GetMapping("/input/{id}")
	public ResponseEntity<String> showMsgC( @PathVariable("id") Integer id) 
	{
		return ResponseEntity.ok("Vendor By Id is =>"+id);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Vendor>> showMsgD() {
		return ResponseEntity.ok(
				Arrays.asList(
						new Vendor(10,"A","HYD"),
						new Vendor(11,"B","HYD"),
						new Vendor(12,"C","HYD")
						)
				);
	}
	
}
