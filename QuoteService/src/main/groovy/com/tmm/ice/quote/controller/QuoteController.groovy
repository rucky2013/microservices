package com.tmm.ice.quote.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@RestController
@RequestMapping
class QuoteController {

	
	public Map getQuote( String reference ){
		//look up from mongo DB
	}
	
	@RequestMapping( value="/premium", method=RequestMethod.POST )
	public Map calculateQuote( @RequestParam("productSchemeMetadata") Map productSchemeMetadata, @RequestParam("quote") Map quote ){
		//calculate the premium for the incoming quote using the metadata
		[premium: 575.85]
	} 
}
