package com.coden2020.hackaton.app.domain.model;

import com.coden2020.hackaton.app.infrastructure.entities.User;

public interface ProvideServiceInterface {
  User attachService(User user, Long serviceId);
}
