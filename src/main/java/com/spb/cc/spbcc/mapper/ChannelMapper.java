package com.spb.cc.spbcc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.spb.cc.spbcc.entity.Channel;

//@Mapper 这里可以使用@Mapper注解，但是每个mapper都加注解比较麻烦，所以统一配置@MapperScan在扫描路径在application类中
public interface ChannelMapper {
	
	@Select("select * from p2p_channel_mercode")
	public List<Channel> getChannelList();
}
