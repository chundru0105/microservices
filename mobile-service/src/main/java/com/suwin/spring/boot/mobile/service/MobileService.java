/**
 * 
 */
package com.suwin.spring.boot.mobile.service;

import java.util.List;

import com.suwin.spring.boot.mobile.service.domain.Mobile;

/**
 * @author Murthy
 *
 */
public interface MobileService {
	
	List<Mobile> getAllMobiles() ;
	
	Mobile getMobileById(int mobileId);
	
	List<Mobile> saveMobile(Mobile mobile);
	
	Mobile updateMobile(Mobile mobile, int mobileId) ;
	
	void deleteMobile(int mobileId) ;

}
