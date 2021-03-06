package bonIDE.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class InheritanceRelEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public InheritanceRelEditPart(View view) {
		super(view);
	}

	/*
	 * @generated NOT
	 */
	@Override
	protected void installRouter() {
		getConnectionFigure().setConnectionRouter(new ManhattanConnectionRouter());
		refreshRouterChange();
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new bonIDE.diagram.edit.policies.InheritanceRelItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new InheritanceLinkFigure();
	}

	/**
	 * @generated
	 */
	public InheritanceLinkFigure getPrimaryShape() {
		return (InheritanceLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InheritanceLinkFigure extends bonIDE.diagram.custom.InheritanceConnection {

		/**
		 * @generated
		 */
		public InheritanceLinkFigure() {

			this.setForegroundColor(THIS_FORE
					);
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
