package net.imglib3.type.try1;

public class ByteType implements ByteReadable< ByteType >, ByteWritable< ByteType >
{
	byte b = 0;

	@Override
	public int getInt() { return b; }

	@Override
	public double getDouble() { return b; }

	@Override
	public void set(byte b) { this.b = b; }

	@Override
	public byte getByte() { return b; }

	@Override
	public void set(ByteType w) { this.b = w.b; }

	//@Override
	//public void get(ByteType r) { r.b = this.b; }
}
