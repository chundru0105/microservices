/**
 * 
 */
package com.suwin.spring.boot.mobile.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suwin.spring.boot.mobile.service.MobileService;
import com.suwin.spring.boot.mobile.service.domain.Mobile;

/**
 * @author Murthy
 *
 */

@RestController
@RequestMapping("/mobile")
public class MobileController {
	
	@Autowired
	private MobileService mobileService;
	
	@GetMapping
	public List<Mobile> getAllMobiles() {
		return mobileService.getAllMobiles();
	}
	
	@GetMapping("/{mobile-id}")
	public Mobile getMobileById(@PathVariable("mobile-id") int mobileId) {
		return mobileService.getMobileById(mobileId);
	}
	
	@PostMapping
	public List<Mobile> saveMobile(@RequestBody Mobile mobile) {
		return mobileService.saveMobile(mobile);
	}
	
	@PutMapping("/{mobile-id}")
	public Mobile updateMobile(@RequestBody Mobile mobile, @PathVariable("mobile-id") int mobileId) {
		return mobileService.updateMobile(mobile, mobileId);
	}
	
	@DeleteMapping("/{mobile-id}")
	public void deleteMobile(@PathVariable("mobile-id") int mobileId) {
		mobileService.deleteMobile(mobileId);
	}

}
