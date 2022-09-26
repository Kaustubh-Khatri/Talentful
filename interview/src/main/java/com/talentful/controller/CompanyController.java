package com.talentful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.talentful.models.Company;
import com.talentful.models.ResponseMessage;
import com.talentful.service.CompanyService;

@RestController
@RequestMapping(path = "/company/")
public class CompanyController {
	
	@Autowired CompanyService companyService;
	
	
	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	public @ResponseBody Company getCompany(@PathVariable (name = "id") String id) {
		return companyService.getCompanyById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody ResponseMessage addCompany(Company company) {
		
		Company response = companyService.saveCompany(company);
		if (response == null) {
			return new ResponseMessage();
		} else {
			return new ResponseMessage(400, "Compnay with Id Already exist!");
		}
		
	}
	
	@RequestMapping(path = "{id}", method = RequestMethod.PUT)
	public @ResponseBody ResponseMessage updateCompany(@PathVariable (name = "id") String id, Company company) {
		company.setId(id);
		companyService.saveCompany(company);
		return new ResponseMessage();
	}
	
	@RequestMapping(path = "_all", method = RequestMethod.GET)
	public @ResponseBody List<Company> getCompany() {
		return companyService.getAllCompanies();
	}
	
	
	/*@RequestMapping(path = "/download", method = RequestMethod.GET)
	public ResponseEntity<Resource> download(String param) throws IOException {

	    // ...

	    InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

	    return ResponseEntity.ok()
	            .headers(headers)
	            .contentLength(file.length())
	            .contentType(MediaType.APPLICATION_OCTET_STREAM)
	            .body(resource);
	}*/

}
