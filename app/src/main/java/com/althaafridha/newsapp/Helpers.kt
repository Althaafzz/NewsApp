package com.althaafridha.newsapp

import android.content.Intent
import com.althaafridha.newsapp.databinding.NewsHeadlineBinding

fun bindNewsHeadline(binding: NewsHeadlineBinding, position: Int) {
    binding.apply {
        imgHeadline.setImageResource(DataNews.photoHeadline[position])
        tvTitleHeadline.text = DataNews.titleHeadline[position]
        tvDescHeadline.text = DataNews.contentHeadline[position]
        tvDateHeadline.text = DataNews.dateHeadline[position]
        tvAuthorHeadline.text = DataNews.authorHeadline[position]
    }
    binding.root.setOnClickListener {
        val intentToDetail = Intent(binding.root.context, Detail::class.java)
        intentToDetail.putExtra(Detail.EXTRA_IMG_HEADLINE, DataNews.photoHeadline[position])
        intentToDetail.putExtra(Detail.EXTRA_TITLE_HEADLINE, DataNews.titleHeadline[position])
        intentToDetail.putExtra(Detail.EXTRA_CONTENT_HEADLINE, DataNews.contentHeadline[position])
        intentToDetail.putExtra(Detail.EXTRA_DATE_HEADLINE, DataNews.dateHeadline[position])
        intentToDetail.putExtra(Detail.EXTRA_AUTHOR_HEADLINE, DataNews.authorHeadline[position])

        binding.root.context.startActivity(intentToDetail)
    }
}