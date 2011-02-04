package hello.groovy

class GroovyClosures {
			
	def variable		
	
	GroovyClosures(variable) {
		this.variable = variable
	}
		
	void iterate(closure) {
		variable.each {
			closure(it)
		}
	}
		
	static void main(args) {
		GroovyClosures groovyClosure = new GroovyClosures([1,2,3,4,5])
		groovyClosure.iterate {println it }
		
		def total = 0
		groovyClosure.iterate { total += it }
		println total
	}

}
