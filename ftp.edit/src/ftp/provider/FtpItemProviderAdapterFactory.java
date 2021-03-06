/**
 */
package ftp.provider;

import ftp.util.FtpAdapterFactory;

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
public class FtpItemProviderAdapterFactory extends FtpAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public FtpItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.FaultTree} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultTreeItemProvider faultTreeItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.FaultTree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFaultTreeAdapter() {
		if (faultTreeItemProvider == null) {
			faultTreeItemProvider = new FaultTreeItemProvider(this);
		}

		return faultTreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.FTNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTNodeItemProvider ftNodeItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.FTNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFTNodeAdapter() {
		if (ftNodeItemProvider == null) {
			ftNodeItemProvider = new FTNodeItemProvider(this);
		}

		return ftNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.OrGate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrGateItemProvider orGateItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.OrGate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrGateAdapter() {
		if (orGateItemProvider == null) {
			orGateItemProvider = new OrGateItemProvider(this);
		}

		return orGateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.AndGate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndGateItemProvider andGateItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.AndGate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndGateAdapter() {
		if (andGateItemProvider == null) {
			andGateItemProvider = new AndGateItemProvider(this);
		}

		return andGateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Fault} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultItemProvider faultItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Fault}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFaultAdapter() {
		if (faultItemProvider == null) {
			faultItemProvider = new FaultItemProvider(this);
		}

		return faultItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Observation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationItemProvider observationItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Observation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObservationAdapter() {
		if (observationItemProvider == null) {
			observationItemProvider = new ObservationItemProvider(this);
		}

		return observationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Port} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortItemProvider portItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortAdapter() {
		if (portItemProvider == null) {
			portItemProvider = new PortItemProvider(this);
		}

		return portItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Connection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionItemProvider connectionItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionAdapter() {
		if (connectionItemProvider == null) {
			connectionItemProvider = new ConnectionItemProvider(this);
		}

		return connectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.DigintalConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigintalConnectionItemProvider digintalConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.DigintalConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDigintalConnectionAdapter() {
		if (digintalConnectionItemProvider == null) {
			digintalConnectionItemProvider = new DigintalConnectionItemProvider(this);
		}

		return digintalConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.AnalogConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogConnectionItemProvider analogConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.AnalogConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalogConnectionAdapter() {
		if (analogConnectionItemProvider == null) {
			analogConnectionItemProvider = new AnalogConnectionItemProvider(this);
		}

		return analogConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.SignalConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalConnectionItemProvider signalConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.SignalConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalConnectionAdapter() {
		if (signalConnectionItemProvider == null) {
			signalConnectionItemProvider = new SignalConnectionItemProvider(this);
		}

		return signalConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.ElectricalConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalConnectionItemProvider electricalConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.ElectricalConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElectricalConnectionAdapter() {
		if (electricalConnectionItemProvider == null) {
			electricalConnectionItemProvider = new ElectricalConnectionItemProvider(this);
		}

		return electricalConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.HydraulicConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydraulicConnectionItemProvider hydraulicConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.HydraulicConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHydraulicConnectionAdapter() {
		if (hydraulicConnectionItemProvider == null) {
			hydraulicConnectionItemProvider = new HydraulicConnectionItemProvider(this);
		}

		return hydraulicConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.MechanicalConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MechanicalConnectionItemProvider mechanicalConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.MechanicalConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMechanicalConnectionAdapter() {
		if (mechanicalConnectionItemProvider == null) {
			mechanicalConnectionItemProvider = new MechanicalConnectionItemProvider(this);
		}

		return mechanicalConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.PrimitiveComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveComponentItemProvider primitiveComponentItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.PrimitiveComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveComponentAdapter() {
		if (primitiveComponentItemProvider == null) {
			primitiveComponentItemProvider = new PrimitiveComponentItemProvider(this);
		}

		return primitiveComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.ComposedComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedComponentItemProvider composedComponentItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.ComposedComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComposedComponentAdapter() {
		if (composedComponentItemProvider == null) {
			composedComponentItemProvider = new ComposedComponentItemProvider(this);
		}

		return composedComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.CompositionElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionElementItemProvider compositionElementItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.CompositionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositionElementAdapter() {
		if (compositionElementItemProvider == null) {
			compositionElementItemProvider = new CompositionElementItemProvider(this);
		}

		return compositionElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.PortValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortValueItemProvider portValueItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.PortValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortValueAdapter() {
		if (portValueItemProvider == null) {
			portValueItemProvider = new PortValueItemProvider(this);
		}

		return portValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Resistor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResistorItemProvider resistorItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Resistor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResistorAdapter() {
		if (resistorItemProvider == null) {
			resistorItemProvider = new ResistorItemProvider(this);
		}

		return resistorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Capacitor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacitorItemProvider capacitorItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Capacitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapacitorAdapter() {
		if (capacitorItemProvider == null) {
			capacitorItemProvider = new CapacitorItemProvider(this);
		}

		return capacitorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.AnalogBattery} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogBatteryItemProvider analogBatteryItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.AnalogBattery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalogBatteryAdapter() {
		if (analogBatteryItemProvider == null) {
			analogBatteryItemProvider = new AnalogBatteryItemProvider(this);
		}

		return analogBatteryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.AnalogSwitch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogSwitchItemProvider analogSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.AnalogSwitch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalogSwitchAdapter() {
		if (analogSwitchItemProvider == null) {
			analogSwitchItemProvider = new AnalogSwitchItemProvider(this);
		}

		return analogSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.AnalogLamp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogLampItemProvider analogLampItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.AnalogLamp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnalogLampAdapter() {
		if (analogLampItemProvider == null) {
			analogLampItemProvider = new AnalogLampItemProvider(this);
		}

		return analogLampItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.DigitalBattery} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalBatteryItemProvider digitalBatteryItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.DigitalBattery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDigitalBatteryAdapter() {
		if (digitalBatteryItemProvider == null) {
			digitalBatteryItemProvider = new DigitalBatteryItemProvider(this);
		}

		return digitalBatteryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.DigitalSwitch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalSwitchItemProvider digitalSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.DigitalSwitch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDigitalSwitchAdapter() {
		if (digitalSwitchItemProvider == null) {
			digitalSwitchItemProvider = new DigitalSwitchItemProvider(this);
		}

		return digitalSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.DigitalLamp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalLampItemProvider digitalLampItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.DigitalLamp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDigitalLampAdapter() {
		if (digitalLampItemProvider == null) {
			digitalLampItemProvider = new DigitalLampItemProvider(this);
		}

		return digitalLampItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.Xor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XorItemProvider xorItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.Xor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXorAdapter() {
		if (xorItemProvider == null) {
			xorItemProvider = new XorItemProvider(this);
		}

		return xorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.NTransistor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NTransistorItemProvider nTransistorItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.NTransistor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNTransistorAdapter() {
		if (nTransistorItemProvider == null) {
			nTransistorItemProvider = new NTransistorItemProvider(this);
		}

		return nTransistorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.PTransistor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTransistorItemProvider pTransistorItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.PTransistor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPTransistorAdapter() {
		if (pTransistorItemProvider == null) {
			pTransistorItemProvider = new PTransistorItemProvider(this);
		}

		return pTransistorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.DFlipFlop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFlipFlopItemProvider dFlipFlopItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.DFlipFlop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDFlipFlopAdapter() {
		if (dFlipFlopItemProvider == null) {
			dFlipFlopItemProvider = new DFlipFlopItemProvider(this);
		}

		return dFlipFlopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.SignalPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalPortItemProvider signalPortItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.SignalPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalPortAdapter() {
		if (signalPortItemProvider == null) {
			signalPortItemProvider = new SignalPortItemProvider(this);
		}

		return signalPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.ElectricalPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalPortItemProvider electricalPortItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.ElectricalPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElectricalPortAdapter() {
		if (electricalPortItemProvider == null) {
			electricalPortItemProvider = new ElectricalPortItemProvider(this);
		}

		return electricalPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.HydraulicPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydraulicPortItemProvider hydraulicPortItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.HydraulicPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHydraulicPortAdapter() {
		if (hydraulicPortItemProvider == null) {
			hydraulicPortItemProvider = new HydraulicPortItemProvider(this);
		}

		return hydraulicPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.VisualPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualPortItemProvider visualPortItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.VisualPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisualPortAdapter() {
		if (visualPortItemProvider == null) {
			visualPortItemProvider = new VisualPortItemProvider(this);
		}

		return visualPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.VisualConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualConnectionItemProvider visualConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.VisualConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisualConnectionAdapter() {
		if (visualConnectionItemProvider == null) {
			visualConnectionItemProvider = new VisualConnectionItemProvider(this);
		}

		return visualConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.MechanicalPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MechanicalPortItemProvider mechanicalPortItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.MechanicalPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMechanicalPortAdapter() {
		if (mechanicalPortItemProvider == null) {
			mechanicalPortItemProvider = new MechanicalPortItemProvider(this);
		}

		return mechanicalPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.TypedPortValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedPortValueItemProvider typedPortValueItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.TypedPortValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypedPortValueAdapter() {
		if (typedPortValueItemProvider == null) {
			typedPortValueItemProvider = new TypedPortValueItemProvider(this);
		}

		return typedPortValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.SignalValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalValueItemProvider signalValueItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.SignalValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalValueAdapter() {
		if (signalValueItemProvider == null) {
			signalValueItemProvider = new SignalValueItemProvider(this);
		}

		return signalValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.ElectricalValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalValueItemProvider electricalValueItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.ElectricalValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElectricalValueAdapter() {
		if (electricalValueItemProvider == null) {
			electricalValueItemProvider = new ElectricalValueItemProvider(this);
		}

		return electricalValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.HydraulicValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydraulicValueItemProvider hydraulicValueItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.HydraulicValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHydraulicValueAdapter() {
		if (hydraulicValueItemProvider == null) {
			hydraulicValueItemProvider = new HydraulicValueItemProvider(this);
		}

		return hydraulicValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.VisualValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualValueItemProvider visualValueItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.VisualValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVisualValueAdapter() {
		if (visualValueItemProvider == null) {
			visualValueItemProvider = new VisualValueItemProvider(this);
		}

		return visualValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.FloatValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatValueItemProvider floatValueItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.FloatValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloatValueAdapter() {
		if (floatValueItemProvider == null) {
			floatValueItemProvider = new FloatValueItemProvider(this);
		}

		return floatValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.SignalConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalConstantItemProvider signalConstantItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.SignalConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalConstantAdapter() {
		if (signalConstantItemProvider == null) {
			signalConstantItemProvider = new SignalConstantItemProvider(this);
		}

		return signalConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.FaultTreeContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultTreeContextItemProvider faultTreeContextItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.FaultTreeContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFaultTreeContextAdapter() {
		if (faultTreeContextItemProvider == null) {
			faultTreeContextItemProvider = new FaultTreeContextItemProvider(this);
		}

		return faultTreeContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ftp.RootEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootEventItemProvider rootEventItemProvider;

	/**
	 * This creates an adapter for a {@link ftp.RootEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRootEventAdapter() {
		if (rootEventItemProvider == null) {
			rootEventItemProvider = new RootEventItemProvider(this);
		}

		return rootEventItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void dispose() {
		if (faultTreeItemProvider != null) faultTreeItemProvider.dispose();
		if (ftNodeItemProvider != null) ftNodeItemProvider.dispose();
		if (orGateItemProvider != null) orGateItemProvider.dispose();
		if (andGateItemProvider != null) andGateItemProvider.dispose();
		if (faultItemProvider != null) faultItemProvider.dispose();
		if (observationItemProvider != null) observationItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (portItemProvider != null) portItemProvider.dispose();
		if (connectionItemProvider != null) connectionItemProvider.dispose();
		if (digintalConnectionItemProvider != null) digintalConnectionItemProvider.dispose();
		if (analogConnectionItemProvider != null) analogConnectionItemProvider.dispose();
		if (signalConnectionItemProvider != null) signalConnectionItemProvider.dispose();
		if (electricalConnectionItemProvider != null) electricalConnectionItemProvider.dispose();
		if (hydraulicConnectionItemProvider != null) hydraulicConnectionItemProvider.dispose();
		if (mechanicalConnectionItemProvider != null) mechanicalConnectionItemProvider.dispose();
		if (primitiveComponentItemProvider != null) primitiveComponentItemProvider.dispose();
		if (composedComponentItemProvider != null) composedComponentItemProvider.dispose();
		if (compositionElementItemProvider != null) compositionElementItemProvider.dispose();
		if (portValueItemProvider != null) portValueItemProvider.dispose();
		if (resistorItemProvider != null) resistorItemProvider.dispose();
		if (capacitorItemProvider != null) capacitorItemProvider.dispose();
		if (analogBatteryItemProvider != null) analogBatteryItemProvider.dispose();
		if (analogSwitchItemProvider != null) analogSwitchItemProvider.dispose();
		if (analogLampItemProvider != null) analogLampItemProvider.dispose();
		if (digitalBatteryItemProvider != null) digitalBatteryItemProvider.dispose();
		if (digitalSwitchItemProvider != null) digitalSwitchItemProvider.dispose();
		if (digitalLampItemProvider != null) digitalLampItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (xorItemProvider != null) xorItemProvider.dispose();
		if (andItemProvider != null) andItemProvider.dispose();
		if (nTransistorItemProvider != null) nTransistorItemProvider.dispose();
		if (pTransistorItemProvider != null) pTransistorItemProvider.dispose();
		if (dFlipFlopItemProvider != null) dFlipFlopItemProvider.dispose();
		if (signalPortItemProvider != null) signalPortItemProvider.dispose();
		if (electricalPortItemProvider != null) electricalPortItemProvider.dispose();
		if (hydraulicPortItemProvider != null) hydraulicPortItemProvider.dispose();
		if (visualPortItemProvider != null) visualPortItemProvider.dispose();
		if (visualConnectionItemProvider != null) visualConnectionItemProvider.dispose();
		if (faultTreeContextItemProvider != null) faultTreeContextItemProvider.dispose();
		if (rootEventItemProvider != null) rootEventItemProvider.dispose();
		if (mechanicalPortItemProvider != null) mechanicalPortItemProvider.dispose();
		if (typedPortValueItemProvider != null) typedPortValueItemProvider.dispose();
		if (signalValueItemProvider != null) signalValueItemProvider.dispose();
		if (electricalValueItemProvider != null) electricalValueItemProvider.dispose();
		if (hydraulicValueItemProvider != null) hydraulicValueItemProvider.dispose();
		if (visualValueItemProvider != null) visualValueItemProvider.dispose();
		if (floatValueItemProvider != null) floatValueItemProvider.dispose();
		if (signalConstantItemProvider != null) signalConstantItemProvider.dispose();
	}

}
