package com.livingprogress.mentorme.services.springdata;

import com.livingprogress.mentorme.entities.Locale;
import com.livingprogress.mentorme.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * The locale repository.
 */
public interface LocaleRepository extends JpaRepository<Locale, Long>, JpaSpecificationExecutor<Locale> {
}

