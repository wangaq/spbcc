package com.spb.cc.spbcc.entity;

public class Channel {
	
	private String pcmc_channel;
	private String pcmc_merCode;
	private String pcmc_stt;
	
	public String getPcmc_channel() {
		return pcmc_channel;
	}
	public void setPcmc_channel(String pcmc_channel) {
		this.pcmc_channel = pcmc_channel;
	}
	public String getPcmc_merCode() {
		return pcmc_merCode;
	}
	public void setPcmc_merCode(String pcmc_merCode) {
		this.pcmc_merCode = pcmc_merCode;
	}
	public String getPcmc_stt() {
		return pcmc_stt;
	}
	public void setPcmc_stt(String pcmc_stt) {
		this.pcmc_stt = pcmc_stt;
	}
	@Override
	public String toString() {
		return "Channel [pcmc_channel=" + pcmc_channel + ", pcmc_merCode=" + pcmc_merCode + ", pcmc_stt=" + pcmc_stt
				+ "]";
	}
}
