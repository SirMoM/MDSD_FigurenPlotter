/**
 */
package FigurPlotter.provider;

import FigurPlotter.util.FigurPlotterAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FigurPlotterItemProviderAdapterFactory extends FigurPlotterAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigurPlotterItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Plotter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlotterItemProvider plotterItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Plotter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlotterAdapter() {
		if (plotterItemProvider == null) {
			plotterItemProvider = new PlotterItemProvider(this);
		}

		return plotterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Point} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointItemProvider pointItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Point}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointAdapter() {
		if (pointItemProvider == null) {
			pointItemProvider = new PointItemProvider(this);
		}

		return pointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Figur} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigurItemProvider figurItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Figur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFigurAdapter() {
		if (figurItemProvider == null) {
			figurItemProvider = new FigurItemProvider(this);
		}

		return figurItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Line} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineItemProvider lineItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineAdapter() {
		if (lineItemProvider == null) {
			lineItemProvider = new LineItemProvider(this);
		}

		return lineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Arrow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowItemProvider arrowItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Arrow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrowAdapter() {
		if (arrowItemProvider == null) {
			arrowItemProvider = new ArrowItemProvider(this);
		}

		return arrowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Rectangle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleItemProvider rectangleItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Rectangle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRectangleAdapter() {
		if (rectangleItemProvider == null) {
			rectangleItemProvider = new RectangleItemProvider(this);
		}

		return rectangleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Circle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleItemProvider circleItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Circle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCircleAdapter() {
		if (circleItemProvider == null) {
			circleItemProvider = new CircleItemProvider(this);
		}

		return circleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Square} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareItemProvider squareItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Square}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSquareAdapter() {
		if (squareItemProvider == null) {
			squareItemProvider = new SquareItemProvider(this);
		}

		return squareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link FigurPlotter.Polygon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonItemProvider polygonItemProvider;

	/**
	 * This creates an adapter for a {@link FigurPlotter.Polygon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPolygonAdapter() {
		if (polygonItemProvider == null) {
			polygonItemProvider = new PolygonItemProvider(this);
		}

		return polygonItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (plotterItemProvider != null) plotterItemProvider.dispose();
		if (pointItemProvider != null) pointItemProvider.dispose();
		if (figurItemProvider != null) figurItemProvider.dispose();
		if (lineItemProvider != null) lineItemProvider.dispose();
		if (arrowItemProvider != null) arrowItemProvider.dispose();
		if (rectangleItemProvider != null) rectangleItemProvider.dispose();
		if (circleItemProvider != null) circleItemProvider.dispose();
		if (squareItemProvider != null) squareItemProvider.dispose();
		if (polygonItemProvider != null) polygonItemProvider.dispose();
	}

}
