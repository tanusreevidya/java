package com.cts.training.service.impl;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.dto.IPODTO;
import com.cts.training.model.IPO;
import com.cts.training.repo.IpoRepo;
import com.cts.training.service.IPOService;

@Service
public class IPOServiceImpl implements IPOService {

	@Autowired
	IpoRepo ir;
		
	@Override
	public IPODTO insert(IPODTO id) {
		IPO re = new IPO();
		BeanUtils.copyProperties(id, re);
		ir.save(re);
		return id;
	}

}
