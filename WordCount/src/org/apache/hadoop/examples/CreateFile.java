package org.apache.hadoop.examples;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class CreateFile {
	
	/**11111w123
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

        Configuration conf=new Configuration();

        FileSystem hdfs=FileSystem.get(conf);

       

        byte[] buff="hello hadoop world!\n".getBytes();

       

        Path dfs=new Path("/test");

       

        FSDataOutputStream outputStream=hdfs.create(dfs);

        outputStream.write(buff,0,buff.length);

       System.out.println("1111");

    }
	
	

}
