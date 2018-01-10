package com.spb.cc.spbcc.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spb.cc.spbcc.entity.Channel;
import com.spb.cc.spbcc.mapper.ChannelMapper;
import com.spb.cc.spbcc.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService {
	
	@Autowired
	private ChannelMapper mapper;
	
	@Override
	public List<Channel> getChannelList() {
		return mapper.getChannelList();
	}

}
