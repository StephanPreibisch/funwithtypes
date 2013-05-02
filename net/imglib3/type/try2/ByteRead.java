package net.imglib3.type.try2;

public interface ByteRead< R extends ByteRead< R > > extends IntRead< R >
{
	byte getByte();
}
