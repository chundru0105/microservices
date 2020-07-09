/**
 * 
 */
package com.suwin.spring.boot.mobile.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.suwin.spring.boot.mobile.service.domain.Mobile;

/**
 * @author Murthy
 *
 */

@Service
public class MobileServiceImpl implements MobileService {
	
	List<Mobile> mobiles = new ArrayList<Mobile>();
	
	@Override
	public List<Mobile> getAllMobiles() {
		return mobiles;
	}

	@Override
	public Mobile getMobileById(int mobileId) {
		Optional<Mobile> mobile = mobiles.stream().filter(m -> m.getId() == mobileId).findFirst();
		mobile.orElseThrow(() -> new RuntimeException("Mobile not found with given ID"));
		return mobile.get();
	}

	@Override
	public List<Mobile> saveMobile(Mobile mobile) {
		if(!mobiles.contains(mobile)) {
			mobiles.add(mobile);
		}
		return mobiles;
	}

	@Override
	public Mobile updateMobile(Mobile mobile, int mobileId) {
		Mobile dbMobile = getMobileById(mobileId);
		mobiles.set(mobiles.indexOf(dbMobile), mobile);
		return mobile;
	}

	@Override
	public void deleteMobile(int mobileId) {
		Mobile dbMobile = getMobileById(mobileId);
		mobiles.remove(dbMobile);
	}
	
	@PostConstruct
	public void init() {
		Mobile mobile = new Mobile();
		
		mobile.setId(1);
		mobile.setName("SAMSUNG");
		mobile.setPrice(10000.00);
		mobile.setStatus("AVAILABLE");
		mobile.setCountryCode("KOR");
		mobile.setAccessoryType("ALL");
		mobile.setLob("ONLINE");
		mobile.setPublicateDate(new SimpleDateFormat("dd/MM/yyy").format(new Date()));
		
		mobiles.add(mobile);
		
		mobile = new Mobile();
		
		mobile.setId(2);
		mobile.setName("SAMSUNG");
		mobile.setPrice(5000.00);
		mobile.setStatus("AVAILABLE");
		mobile.setCountryCode("KOR");
		mobile.setAccessoryType("ALL");
		mobile.setLob("ONLINE");
		mobile.setPublicateDate(new SimpleDateFormat("dd/MM/yyy").format(new Date()));
		
		mobiles.add(mobile);
		
		mobile = new Mobile();
		
		mobile.setId(3);
		mobile.setName("Iphone");
		mobile.setPrice(99000.00);
		mobile.setStatus("AVAILABLE");
		mobile.setCountryCode("USA");
		mobile.setAccessoryType("ALL");
		mobile.setLob("RETAILER");
		mobile.setPublicateDate(new SimpleDateFormat("dd/MM/yyy").format(new Date()));
		
		mobiles.add(mobile);
		
	}

}
