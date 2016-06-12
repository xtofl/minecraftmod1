var READTHEDOCS_DATA = {
    "project": "mcforge", 
    "theme": "readthedocs", 
    "version": "latest", 
    "source_suffix": ".md", 
    "api_host": "https://readthedocs.org", 
    "language": "en", 
    "commit": "5d87fa260a8e143540ac0b1573c93c05693b7a68", 
    "docroot": "/home/docs/checkouts/readthedocs.org/user_builds/mcforge/checkouts/latest/docs", 
    "builder": "mkdocs", 
    "page": null
}

// Old variables
var doc_version = "latest";
var doc_slug = "mcforge";
var page_name = "None";
var html_theme = "readthedocs";

READTHEDOCS_DATA["page"] = mkdocs_page_input_path.substr(
    0, mkdocs_page_input_path.lastIndexOf(READTHEDOCS_DATA.source_suffix));
