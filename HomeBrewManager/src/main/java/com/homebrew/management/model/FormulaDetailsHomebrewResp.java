package com.homebrew.management.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homebrew.management.model.bottle.Bottle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FormulaDetailsHomebrewResp {

	private String name;
	private String full_name;
	private String tap;
	private String oldname;
	private List<Object> aliases;
	private List<Object> versioned_formulae;
	private String desc;
	private String license;
	private String homepage;
	private Version versions;
	private URL urls;
	private Float revision;
	private Float version_scheme;
	private Bottle bottle;
	private boolean keg_only;
	private String keg_only_reason;
	private boolean bottle_disabled;
	private List<Object> options;
	private List<Object> build_dependencies;
	private List<Object> dependencies;
	private List<Object> recommended_dependencies;
	private List<Object> optional_dependencies;
	private List<Object> uses_from_macos;
	private List<Object> requirements;
	private List<Object> conflicts_with;
	private String caveats;
	private List<Installed> installed;
	private String linked_keg;
	private boolean pinned;
	private boolean outdated;
	private boolean deprecated;
	private String deprecation_date;
	private String deprecation_reason;
	private boolean disabled;
	private String disable_date;
	private String disable_reason;
	Analytics analytics;
	@JsonProperty("analytics-linux")
	Analytics analytics_linux;
	private String generated_date;

	/*
	 * private String name; private String full_name; private String tap; private
	 * String oldname = null; ArrayList < Object > aliases = new ArrayList < Object
	 * > (); ArrayList < Object > versioned_formulae = new ArrayList < Object > ();
	 * private String desc; private String license; private String homepage;
	 * Versions VersionsObject; Urls UrlsObject; private float revision; private
	 * float version_scheme; Bottle BottleObject; private boolean keg_only; private
	 * String keg_only_reason = null; private boolean bottle_disabled; ArrayList <
	 * Object > options = new ArrayList < Object > (); ArrayList < Object >
	 * build_dependencies = new ArrayList < Object > (); ArrayList < Object >
	 * dependencies = new ArrayList < Object > (); ArrayList < Object >
	 * recommended_dependencies = new ArrayList < Object > (); ArrayList < Object >
	 * optional_dependencies = new ArrayList < Object > (); ArrayList < Object >
	 * uses_from_macos = new ArrayList < Object > (); ArrayList < Object >
	 * requirements = new ArrayList < Object > (); ArrayList < Object >
	 * conflicts_with = new ArrayList < Object > (); private String caveats = null;
	 * ArrayList < Object > installed = new ArrayList < Object > (); private String
	 * linked_keg; private boolean pinned; private boolean outdated; private boolean
	 * deprecated; private String deprecation_date = null; private String
	 * deprecation_reason = null; private boolean disabled; private String
	 * disable_date = null; private String disable_reason = null; Analytics
	 * AnalyticsObject; Analytics - linux Analytics - linuxObject; private String
	 * generated_date;
	 */
}
