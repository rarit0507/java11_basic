package structural.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get110Volt() {
		return get110Volt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = get12Volt();
		return convertVolt(v, 12);
	}

	@Override
	public Volt get9Volt() {
		Volt v = get9Volt();
		return convertVolt(v, 9);
	}

	@Override
	public Volt get6Volt() {
		Volt v = get6Volt();
		return convertVolt(v, 6);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getAmount()/i);
	}

}
