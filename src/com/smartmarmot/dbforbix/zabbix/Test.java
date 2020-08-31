package com.smartmarmot.dbforbix.zabbix;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] data=new byte[]{'\1'};
		byte[] header = new byte[] {
				'Z', 'B', 'X', 'D', '\1',
				(byte)(data.length & 0xFF),
				(byte)((data.length >> 8) & 0xFF),
				(byte)((data.length >> 16) & 0xFF),
				(byte)((data.length >> 24) & 0xFF),
				'\0', '\0', '\0', '\0'};
			 
			byte[] packet = new byte[header.length + data.length];
			System.arraycopy(header, 0, packet, 0, header.length);
			System.arraycopy(data, 0, packet, header.length, data.length);

	}

}
