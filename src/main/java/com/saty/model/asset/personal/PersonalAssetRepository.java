package com.saty.model.asset.personal;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.saty.domainmodel.asset.personal.PersonalAsset;

/**
 * This interface extends MongoRepository of Springframework, implementation of
 * which is provided by Spring with basic CRUD operations and developer neither
 * need to make connection with db nor to write basic CRUD operations
 * 
 *
 */
public interface PersonalAssetRepository extends MongoRepository<PersonalAsset, String> {

	public Collection<PersonalAsset> findByAssetName(String assetName);
}
