package net.imglib3.type.try2;

public interface IntRead< R extends IntRead< R > > extends Readable< R >
{
	int getInt();
}
