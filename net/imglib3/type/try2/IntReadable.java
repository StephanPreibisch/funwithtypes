package net.imglib3.type.try2;

public interface IntReadable< R extends IntReadable< R > > extends DoubleReadable< R >
{
	int getInt();
}
