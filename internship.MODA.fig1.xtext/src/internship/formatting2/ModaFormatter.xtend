/*
 * generated by Xtext 2.14.0
 */
package internship.formatting2

import com.google.inject.Inject
import internship.moda.fig1.MODA
import internship.services.ModaGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ModaFormatter extends AbstractFormatter2 {
	
	@Inject extension ModaGrammarAccess

	def dispatch void format(MODA mODA, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		mODA.sociotechnicalsystem.format
		for (data : mODA.data) {
			data.format
		}
		mODA.software.format
		for (model : mODA.model) {
			model.format
		}
		for (modelRole : mODA.modelrole) {
			modelRole.format
		}
	}
	
	// TODO: implement for 
}
