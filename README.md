



<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=1020">
    
    
    <title>Mobile-phone-tracking-/README.md at master · AnshulBasia/Mobile-phone-tracking-</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="AnshulBasia/Mobile-phone-tracking-" name="twitter:title" /><meta content="Mobile-phone-tracking- -  I have designed a data structure that will help us solve a simpliﬁed version of the mobile phone tracking problem, i.e., the fundamental problem of cellular networks: When..." name="twitter:description" /><meta content="https://avatars2.githubusercontent.com/u/12856392?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars2.githubusercontent.com/u/12856392?v=3&amp;s=400" property="og:image" /><meta content="AnshulBasia/Mobile-phone-tracking-" property="og:title" /><meta content="https://github.com/AnshulBasia/Mobile-phone-tracking-" property="og:url" /><meta content="Mobile-phone-tracking- -  I have designed a data structure that will help us solve a simpliﬁed version of the mobile phone tracking problem, i.e., the fundamental problem of cellular networks: When..." property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/MTI4NTYzOTI6YjQyMWY2YTEyNmYwMzZlNDI3NzUwZGJhYzIxZmVhMzQ6NDA2MWY4ZWY5YWVlZDM3MTBiYmRlMjIwNTZhMjQ0ZGMzNWQwNWFlZGIyN2NmZjk2YjhkNWI0ZGU5MDFkNGZmMQ==--a820b7edf7d00f467ebf2fc8ae3ee42767baca26">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

    <meta name="google-site-verification" content="KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU">
    <meta name="google-analytics" content="UA-3769691-2">

<meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="3B61D146:11C2:1B2C064:56608549" name="octolytics-dimension-request_id" /><meta content="12856392" name="octolytics-actor-id" /><meta content="AnshulBasia" name="octolytics-actor-login" /><meta content="7f1f0273067b6a7c70b90e3a20305bc566003589765c6df909ecff3ac8f490da" name="octolytics-actor-hash" />
<meta content="/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show" data-pjax-transient="true" name="analytics-location" />
<meta content="Rails, view, blob#show" data-pjax-transient="true" name="analytics-event" />


  <meta class="js-ga-set" name="dimension1" content="Logged In">
    <meta class="js-ga-set" name="dimension4" content="New repo nav">




        <meta name="hostname" content="github.com">
    <meta name="user-login" content="AnshulBasia">

        <meta name="expected-hostname" content="github.com">

      <link rel="mask-icon" href="https://assets-cdn.github.com/pinned-octocat.svg" color="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

    <meta content="fc5424f25a646730699b7697991e52558c800467" name="form-nonce" />

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github-d7e0b0c4fd7711345cdfc8fa9695541f6b64640cfc5897e9ea2337eba685ec9c.css" integrity="sha256-1+CwxP13ETRc38j6lpVUH2tkZAz8WJfp6iM366aF7Jw=" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github2-a2501013b84e6062c9171a31d4fdb2225390126ddc5d8453188bc41b2a82ce18.css" integrity="sha256-olAQE7hOYGLJFxox1P2yIlOQEm3cXYRTGIvEGyqCzhg=" media="all" rel="stylesheet" />
    
    
    


    <meta http-equiv="x-pjax-version" content="eb69116aa48ed68be3ac711fb834f27e">

      
  <meta name="description" content="Mobile-phone-tracking- -  I have designed a data structure that will help us solve a simpliﬁed version of the mobile phone tracking problem, i.e., the fundamental problem of cellular networks: When a phone is called, ﬁnd where it is located so that a connection may be established">
  <meta name="go-import" content="github.com/AnshulBasia/Mobile-phone-tracking- git https://github.com/AnshulBasia/Mobile-phone-tracking-.git">

  <meta content="12856392" name="octolytics-dimension-user_id" /><meta content="AnshulBasia" name="octolytics-dimension-user_login" /><meta content="43129862" name="octolytics-dimension-repository_id" /><meta content="AnshulBasia/Mobile-phone-tracking-" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="43129862" name="octolytics-dimension-repository_network_root_id" /><meta content="AnshulBasia/Mobile-phone-tracking-" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/AnshulBasia/Mobile-phone-tracking-/commits/master.atom" rel="alternate" title="Recent Commits to Mobile-phone-tracking-:master" type="application/atom+xml">

  </head>


  <body class="logged_in   env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>

    
    
    



      <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/AnshulBasia/Mobile-phone-tracking-/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/AnshulBasia/Mobile-phone-tracking-/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <label class="js-chromeless-input-container form-control">
    <div class="scope-badge">This repository</div>
    <input type="text"
      class="js-site-search-focus js-site-search-field is-clearable chromeless-input"
      data-hotkey="s"
      name="q"
      placeholder="Search"
      aria-label="Search this repository"
      data-global-scope-placeholder="Search GitHub"
      data-repo-scope-placeholder="Search"
      tabindex="1"
      autocapitalize="off">
  </label>
</form>
      </div>

      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com/" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item">
      <span class="js-socket-channel js-updatable-content"
        data-channel="notification-changed:AnshulBasia"
        data-url="/notifications/header">
      <a href="/notifications" aria-label="You have no unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:read" data-hotkey="g n">
          <span class="mail-status all-read"></span>
          <span class="octicon octicon-bell"></span>
</a>  </span>

  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new…"
       data-ga-click="Header, create new, icon:add">
      <span class="octicon octicon-plus left"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>


  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="AnshulBasia/Mobile-phone-tracking-">This repository</span>
  </div>
    <a class="dropdown-item" href="/AnshulBasia/Mobile-phone-tracking-/issues/new" data-ga-click="Header, create new issue">
      New issue
    </a>
    <a class="dropdown-item" href="/AnshulBasia/Mobile-phone-tracking-/settings/collaboration" data-ga-click="Header, create new collaborator">
      New collaborator
    </a>

      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-sw js-menu-target" href="/AnshulBasia"
       aria-label="View profile and more"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@AnshulBasia" class="avatar" height="20" src="https://avatars1.githubusercontent.com/u/12856392?v=3&amp;s=40" width="20" />
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu  dropdown-menu-sw">
        <div class=" dropdown-header header-nav-current-user css-truncate">
            Signed in as <strong class="css-truncate-target">AnshulBasia</strong>

        </div>


        <div class="dropdown-divider"></div>

          <a class="dropdown-item" href="/AnshulBasia" data-ga-click="Header, go to profile, text:your profile">
            Your profile
          </a>
        <a class="dropdown-item" href="/stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
          <a class="dropdown-item" href="/integrations" data-ga-click="Header, go to integrations, text:integrations">
            Integrations
          </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>

          <div class="dropdown-divider"></div>

          <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
            Settings
          </a>

          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/logout" class="logout-form" data-form-nonce="fc5424f25a646730699b7697991e52558c800467" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="AeS0P5gNt711tR4SpGCGocyPOVfKgt9ywPeIe+AHwTGioA6vzXtsMMXNHT90wijELfFgPMVr1SRZVcIWKFrrrw==" /></div>
            <button class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
              Sign out
            </button>
</form>
      </div>
    </div>
  </li>
</ul>


    
  </div>
</div>

      

      


    <div id="start-of-content" class="accessibility-aid"></div>

    <div id="js-flash-container">
</div>


    <div role="main" class="main-content">
        <div itemscope itemtype="http://schema.org/WebPage">
    <div id="js-repo-pjax-container" class="context-loader-container js-repo-nav-next" data-pjax-container>
      
<div class="pagehead repohead instapaper_ignore readability-menu experiment-repo-nav">
  <div class="container repohead-details-container">

    

<ul class="pagehead-actions">

  <li>
        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-form-nonce="fc5424f25a646730699b7697991e52558c800467" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="pGRwECPk2LixId6YWFMU78uG6ZK2rDr7V09NVy71t0ONgf5pQRnGfCjXs2iLaVa3qFBFx+OPwziFifC0PrJfBw==" /></div>      <input id="repository_id" name="repository_id" type="hidden" value="43129862" />

        <div class="select-menu js-menu-container js-select-menu">
          <a href="/AnshulBasia/Mobile-phone-tracking-/subscription"
            class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
            data-ga-click="Repository, click Watch settings, action:blob#show">
            <span class="js-select-button">
              <span class="octicon octicon-eye"></span>
              Unwatch
            </span>
          </a>
          <a class="social-count js-social-count" href="/AnshulBasia/Mobile-phone-tracking-/watchers">
            1
          </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header">
              <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
              <span class="select-menu-title">Notifications</span>
            </div>

              <div class="select-menu-list js-navigation-container" role="menu">

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <div class="select-menu-item-text">
                    <input id="do_included" name="do" type="radio" value="included" />
                    <span class="select-menu-item-heading">Not watching</span>
                    <span class="description">Be notified when participating or @mentioned.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span class="octicon octicon-eye"></span>
                      Watch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                  <span class="select-menu-item-icon octicon octicon octicon-check"></span>
                  <div class="select-menu-item-text">
                    <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                    <span class="select-menu-item-heading">Watching</span>
                    <span class="description">Be notified of all conversations.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span class="octicon octicon-eye"></span>
                      Unwatch
                    </span>
                  </div>
                </div>

                <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <div class="select-menu-item-text">
                    <input id="do_ignore" name="do" type="radio" value="ignore" />
                    <span class="select-menu-item-heading">Ignoring</span>
                    <span class="description">Never be notified.</span>
                    <span class="js-select-button-text hidden-select-button-text">
                      <span class="octicon octicon-mute"></span>
                      Stop ignoring
                    </span>
                  </div>
                </div>

              </div>

            </div>
          </div>
        </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/AnshulBasia/Mobile-phone-tracking-/unstar" class="js-toggler-form starred js-unstar-button" data-form-nonce="fc5424f25a646730699b7697991e52558c800467" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="i+oVP+TPGucOR25EgDZEHiJSgKzuR7R0qDFDZud6584Oa4Df+RZpUuTTr9t4I0/B8DykZMk6NtgFp2oQBg9oYQ==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar AnshulBasia/Mobile-phone-tracking-"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/AnshulBasia/Mobile-phone-tracking-/stargazers">
          0
        </a>
</form>
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/AnshulBasia/Mobile-phone-tracking-/star" class="js-toggler-form unstarred js-star-button" data-form-nonce="fc5424f25a646730699b7697991e52558c800467" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="o0wvU+r1M6QNCh+XteMIUzqx3Q1f2pzfvratcVrpSIqSz+gnyRenrnNvRVIpAyDhrWBGGb43lH8HTT48JnHkFw==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star AnshulBasia/Mobile-phone-tracking-"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/AnshulBasia/Mobile-phone-tracking-/stargazers">
          0
        </a>
</form>  </div>

  </li>

  <li>
          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/AnshulBasia/Mobile-phone-tracking-/fork" class="btn-with-count" data-form-nonce="fc5424f25a646730699b7697991e52558c800467" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="yKc+1zQp2eaVEFWdjzBPLlLC51KsiyU1BJwIhpN2HyTsjwuTeajxFSZsfsBe0GDjT9O12WfEOhhe4B4+cvgU/Q==" /></div>
            <button
                type="submit"
                class="btn btn-sm btn-with-count"
                data-ga-click="Repository, show fork modal, action:blob#show; text:Fork"
                title="Fork your own copy of AnshulBasia/Mobile-phone-tracking- to your account"
                aria-label="Fork your own copy of AnshulBasia/Mobile-phone-tracking- to your account">
              <span class="octicon octicon-repo-forked"></span>
              Fork
            </button>
</form>
    <a href="/AnshulBasia/Mobile-phone-tracking-/network" class="social-count">
      1
    </a>
  </li>
</ul>

    <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public ">
  <span class="octicon octicon-repo"></span>
  <span class="author"><a href="/AnshulBasia" class="url fn" itemprop="url" rel="author"><span itemprop="title">AnshulBasia</span></a></span><!--
--><span class="path-divider">/</span><!--
--><strong><a href="/AnshulBasia/Mobile-phone-tracking-" data-pjax="#js-repo-pjax-container">Mobile-phone-tracking-</a></strong>

  <span class="page-context-loader">
    <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
  </span>

</h1>

  </div>
  <div class="container">
    
<nav class="reponav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/AnshulBasia/Mobile-phone-tracking-/issues/counts">

  <a href="/AnshulBasia/Mobile-phone-tracking-" aria-label="Code" aria-selected="true" class="js-selected-navigation-item selected reponav-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /AnshulBasia/Mobile-phone-tracking-">
    <span class="octicon octicon-code"></span>
    Code
</a>
    <a href="/AnshulBasia/Mobile-phone-tracking-/issues" class="js-selected-navigation-item reponav-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /AnshulBasia/Mobile-phone-tracking-/issues">
      <span class="octicon octicon-issue-opened"></span>
      Issues
      <span class="counter">0</span>

</a>
  <a href="/AnshulBasia/Mobile-phone-tracking-/pulls" class="js-selected-navigation-item reponav-item" data-hotkey="g p" data-selected-links="repo_pulls /AnshulBasia/Mobile-phone-tracking-/pulls">
    <span class="octicon octicon-git-pull-request"></span>
    Pull requests
    <span class="counter">0</span>

</a>
    <a href="/AnshulBasia/Mobile-phone-tracking-/wiki" class="js-selected-navigation-item reponav-item" data-hotkey="g w" data-selected-links="repo_wiki /AnshulBasia/Mobile-phone-tracking-/wiki">
      <span class="octicon octicon-book"></span>
      Wiki
</a>
  <a href="/AnshulBasia/Mobile-phone-tracking-/pulse" class="js-selected-navigation-item reponav-item" data-selected-links="pulse /AnshulBasia/Mobile-phone-tracking-/pulse">
    <span class="octicon octicon-pulse"></span>
    Pulse
</a>
  <a href="/AnshulBasia/Mobile-phone-tracking-/graphs" class="js-selected-navigation-item reponav-item" data-selected-links="repo_graphs repo_contributors /AnshulBasia/Mobile-phone-tracking-/graphs">
    <span class="octicon octicon-graph"></span>
    Graphs
</a>
    <a href="/AnshulBasia/Mobile-phone-tracking-/settings" class="js-selected-navigation-item reponav-item" data-selected-links="repo_settings repo_branch_settings hooks /AnshulBasia/Mobile-phone-tracking-/settings">
      <span class="octicon octicon-gear"></span>
      Settings
</a>
</nav>

  </div>
</div>

<div class="container repo-container new-discussion-timeline experiment-repo-nav">
  <div class="repository-content">

    

<a href="/AnshulBasia/Mobile-phone-tracking-/blob/8a3af9de1c7187f03142556d4a1064babf1727e3/README.md" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:8aaf865f8b813b90c8135c6817dd1799 -->

  <div class="file-navigation js-zeroclipboard-container">
    
<div class="select-menu js-menu-container js-select-menu left">
  <button class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    title="master"
    type="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <i>Branch:</i>
    <span class="js-select-button css-truncate-target">master</span>
  </button>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
        <span class="select-menu-title">Switch branches/tags</span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Find or create a branch…" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/AnshulBasia/Mobile-phone-tracking-/blob/master/README.md"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="master">
                master
              </span>
            </a>
        </div>

          <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/AnshulBasia/Mobile-phone-tracking-/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" data-form-nonce="fc5424f25a646730699b7697991e52558c800467" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="fHEoxpRQpC/NyJf3A4uMOnZBpboScW+AD7ye0KCjInmGlx1s39nBiWPxY9b3+K/jM2i34OF2wrKDQVLD88rMqQ==" /></div>
            <span class="octicon octicon-git-branch select-menu-item-icon"></span>
            <div class="select-menu-item-text">
              <span class="select-menu-item-heading">Create branch: <span class="js-new-item-name"></span></span>
              <span class="description">from ‘master’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="master">
            <input type="hidden" name="path" id="path" value="README.md">
</form>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

    <div class="btn-group right">
      <a href="/AnshulBasia/Mobile-phone-tracking-/find/master"
            class="js-show-file-finder btn btn-sm"
            data-pjax
            data-hotkey="t">
        Find file
      </a>
      <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button">Copy path</button>
    </div>
    <div class="breadcrumb js-zeroclipboard-target">
      <span class="repo-root js-repo-root"><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/AnshulBasia/Mobile-phone-tracking-" class="" data-branch="master" data-pjax="true" itemscope="url"><span itemprop="title">Mobile-phone-tracking-</span></a></span></span><span class="separator">/</span><strong class="final-path">README.md</strong>
    </div>
  </div>

<include-fragment class="commit-tease" src="/AnshulBasia/Mobile-phone-tracking-/contributors/master/README.md">
  <div>
    Fetching contributors&hellip;
  </div>

  <div class="commit-tease-contributors">
    <img alt="" class="loader-loading left" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif" width="16" />
    <span class="loader-error">Cannot retrieve contributors at this time</span>
  </div>
</include-fragment>
<div class="file">
  <div class="file-header">
  <div class="file-actions">

    <div class="btn-group">
      <a href="/AnshulBasia/Mobile-phone-tracking-/raw/master/README.md" class="btn btn-sm " id="raw-url">Raw</a>
        <a href="/AnshulBasia/Mobile-phone-tracking-/blame/master/README.md" class="btn btn-sm js-update-url-with-hash">Blame</a>
      <a href="/AnshulBasia/Mobile-phone-tracking-/commits/master/README.md" class="btn btn-sm " rel="nofollow">History</a>
    </div>

        <a class="octicon-btn tooltipped tooltipped-nw"
           href="https://windows.github.com"
           aria-label="Open this file in GitHub Desktop"
           data-ga-click="Repository, open with desktop, type:windows">
            <span class="octicon octicon-device-desktop"></span>
        </a>

        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/AnshulBasia/Mobile-phone-tracking-/edit/master/README.md" class="inline-form js-update-url-with-hash" data-form-nonce="fc5424f25a646730699b7697991e52558c800467" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="GsE/qnYl/twSySr6CyULWsbkuou2fClw1sF5+dcFWNtHYI2xm8erfhYKWvRUfsdYCdsVPelYiEABnkELP2/JZQ==" /></div>
          <button class="octicon-btn tooltipped tooltipped-nw" type="submit"
            aria-label="Edit this file" data-hotkey="e" data-disable-with>
            <span class="octicon octicon-pencil"></span>
          </button>
</form>        <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/AnshulBasia/Mobile-phone-tracking-/delete/master/README.md" class="inline-form" data-form-nonce="fc5424f25a646730699b7697991e52558c800467" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="FSu94ZYpA0QKvSdSmdwnUnmVhcM6j8IcUeetnxsSVlwkmPGjhJLUW2b1ZDFa2qth3YUfrf4eHgiCk4BWG8KS5w==" /></div>
          <button class="octicon-btn octicon-btn-danger tooltipped tooltipped-nw" type="submit"
            aria-label="Delete this file" data-disable-with>
            <span class="octicon octicon-trashcan"></span>
          </button>
</form>  </div>

  <div class="file-info">
      32 lines (30 sloc)
      <span class="file-info-divider"></span>
    4.19 KB
  </div>
</div>

  
  <div id="readme" class="blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="mainContentOfPage"><h1><a id="user-content-mobile-phone-tracking-" class="anchor" href="#mobile-phone-tracking-" aria-hidden="true"><span class="octicon octicon-link"></span></a>Mobile-phone-tracking-</h1>

<p>I have designed a data structure that will help us solve a simpliﬁed version of the mobile phone tracking problem, i.e., the 
 fundamental problem of cellular networks: When a phone is called, ﬁnd where it is located so that a connection may be 
 established.</p>

<p>Mobile phone tracking system description
As we know each mobile phone that is switched on is connected to the base station which is nearest. These base stations are
popularly called cell phone towers. Although sometimes we may be within range of more than one base station, each phone is 
registered to exactly one base station at any point of time. When the phone moves from the area of one base station to another,
it will be de-registered at its current base station and re-registered at new base station.
Making a phone call. When a phone call is made from phone p1 registered with base station b1 to a phone p2, the ﬁrst thing that
the base station b1 has to do is to ﬁnd the base station with which p2 is registered. For this purpose there is an elaborate
technology framework that has been developed over time. You can read more about it on the Web. But, for now, we will assume
that b1 sends a query to a central server C which maintains a data structure that can answer the query and return the name of
the base station, let’s call it b2, with which p2 is registered. C will also send some routing information to b1 so that b1
can initiate a call with b2 and, through the base stations p1 and p2 can talk. It is the data structure at C that we will be 
implementing in this.
A hierarchical call routing structure. We will assume that geography is partitioned in a hierarchical way. At the lowest level is the individual base station which deﬁnes an area around it such that all phones in that area are registered with it, e.g., all phones that are currently located in Bharti building, School of IT and IIT Hospital are registered with the base station in Jia Sarai. This base station also serves phone in Jia Sarai and maybe some phones on Outer Ring Road in front of Jia Sarai. Further we assume that base stations are grouped into geographical locations served by an level 1 area exchange. So, for example, the Jia Sarai base station may be served by the Hauz Khas level 1 area exchange. Each level i area exchange is served by a level i+1 area exchange which serves a number of level i area exchanges, e.g., the Hauz Khas level 1 area exchange and the Malviya level 1 area exchange may be both served by a South-Central Delhi level 2 area exchange. A base station can be considered to be a level 0 area exchange in this hierarchical structure. Given a level i exchange f, we say that the level i + 1 exchange that serves it is the parent of f, and denote this parent(f). We will call this hierarchical call routing structure the routing map of the mobile phone network.
Maintaining the location of mobile phones. Every level i area exchange, e, maintains a set of mobile phones, Se, as follows.<br>
The set Se is called the resident set of e. The level 0 area exchanges (base stations) maintain the set of mobile phones 
registered directly with them. A level i+1 area exchange e, maintains the set Se deﬁned as follows se = [ parent(f)=e Sf,
i.e., the union of the sets of mobile phones maintained by all the level i area exchanges it serves. Clearly, the root of
the routing map maintains the set of all currently registered mobile phones.
Tracking a mobile phone. The routing map along with the resident sets of each area exchange makes up the mobile phone tracking
data structure we will be using. This data structure will be stored at the central server C. The process of tracking goes
as follows.
• When a base station b receives a call for a mobile phone with number m it sends this query to C. 
• If the root of the routing map is r, we ﬁrst check if m ∈ Sr. If not then we tell b that the number m is “not reachable.” 
• If m ∈ Sr we ﬁnd that e such that parent(e) = r and m ∈ Se, i.e. we ﬁnd the child of r which contains m in its resident set.
• Continue like this till we reach all the way down to a leaf of the routing map. This leaf is a base station b0. The central
  server sends b0 to b along with the path in the routing map from b to b0.</p>
</article>
  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

  </div>
  <div class="modal-backdrop"></div>
</div>

    </div>
  </div>

    </div>

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>
        <li><a href="https://github.com/pricing" data-ga-click="Footer, go to pricing, text:pricing">Pricing</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.07191s from github-fe125-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>
    </ul>
  </div>
</div>



    
    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <button type="button" class="flash-close js-flash-close js-ajax-error-dismiss" aria-label="Dismiss error">
        <span class="octicon octicon-x"></span>
      </button>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" integrity="sha256-l2+92s2tzzK6vbHiyKRvr+c1chcJSka10K/YmAXWu/c=" src="https://assets-cdn.github.com/assets/frameworks-976fbddacdadcf32babdb1e2c8a46fafe7357217094a46b5d0afd89805d6bbf7.js"></script>
      <script async="async" crossorigin="anonymous" integrity="sha256-Mi4HfYg0Y9OJbMUjdHpzbNZwCTb+mq1vSFup/jIeD6M=" src="https://assets-cdn.github.com/assets/github-322e077d883463d3896cc523747a736cd6700936fe9aad6f485ba9fe321e0fa3.js"></script>
      
      
      
    <div class="js-stale-session-flash stale-session-flash flash flash-warn flash-banner hidden">
      <span class="octicon octicon-alert"></span>
      <span class="signed-in-tab-flash">You signed in with another tab or window. <a href="">Reload</a> to refresh your session.</span>
      <span class="signed-out-tab-flash">You signed out in another tab or window. <a href="">Reload</a> to refresh your session.</span>
    </div>
  </body>
</html>

