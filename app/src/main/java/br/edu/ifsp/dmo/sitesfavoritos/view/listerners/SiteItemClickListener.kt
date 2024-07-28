package br.edu.ifsp.dmo.sitesfavoritos.view.listerners

interface SiteItemClickListener {
    fun clickHeartSiteItem(position: Int)
    fun clickSiteItem(position: Int)
    fun clickDeleteSiteItem(position: Int)
}
