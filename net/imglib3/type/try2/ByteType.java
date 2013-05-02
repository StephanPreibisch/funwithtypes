package net.imglib3.type.try2;

public class ByteType implements ByteSet, ByteRead< ByteType >
{
	byte b  = 0;
	
	@Override
	public ByteType get() { return this; }

	@Override
	public void set(ByteRead<?> r) { this.b = r.getByte(); }

	@Override
	public int getInt() { return b; }

	@Override
	public byte getByte() { return b; }

}
