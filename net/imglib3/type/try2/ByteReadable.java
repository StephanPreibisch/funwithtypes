package net.imglib3.type.try2;

public interface ByteReadable< R extends ByteReadable< R > > extends IntReadable< R >
{
	byte getByte();
}
