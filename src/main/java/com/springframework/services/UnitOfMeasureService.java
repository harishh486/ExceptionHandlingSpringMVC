package com.springframework.services;

import com.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by Harish on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
