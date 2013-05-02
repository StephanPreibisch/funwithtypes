package net.imglib3.type.try1;

public interface DoubleWritable< W extends DoubleWritable< W > > extends IntWritable < W >
{
	void set( double d );
}
