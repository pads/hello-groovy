package hello.groovy

import hello.java.HelloJava

class GroovyBooleans {
  
  static void evaluateObject(object) {
	def evaluationResult = object ? 'evaluated to true' : 'evaluated to false'
	println "${object} ${evaluationResult}"
  }
			
  static void main(args) {
	
	evaluateObject('non-empty string')
	evaluateObject('')
	
	evaluateObject(1)
	evaluateObject(0)
	
	evaluateObject()
	
	evaluateObject(['non-empty list'])
	evaluateObject([])
	
	evaluateObject(new HelloJava())
	evaluateObject(new HelloGroovy()) 
	
  }	
	
}
