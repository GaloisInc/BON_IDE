/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bonIDE.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bonIDE.IndexClause}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IndexClauseValidator {
	boolean validate();

	boolean validateIdentifier(String value);
	boolean validateTerms(EList<String> value);
}
