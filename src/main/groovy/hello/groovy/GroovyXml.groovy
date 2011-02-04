package hello.groovy

class GroovyXml {

	static void main(args) {
		XmlParser parser = new XmlParser()
		def accounts = parser.parse('groovy.xml')
		def currentAccount = accounts.account.any { it.@type == 'current' }
		if(currentAccount) {
			println 'ok!'
		}
	}
	
}
