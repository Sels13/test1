import Head from 'next/head'
import 'tailwindcss/tailwind.css'
import { VisualEditing } from '@sanity/visual-editing/next-pages-router'
import { AppProps } from 'next/app'
import dynamic from 'next/dynamic'

export interface SharedPageProps {
  draftMode: boolean
  token: string
}

const PreviewProvider = dynamic(() => import('components/PreviewProvider'))

export default function App({ Component, pageProps }: AppProps<SharedPageProps>) {
  const { draftMode, token } = pageProps

  return (
    <>
      <Head>
        <link rel="manifest" href="/public/favicon/site.webmanifest" />
      </Head>
      {draftMode ? (
        <PreviewProvider token={token}>
          <Component {...pageProps} />
        </PreviewProvider>
      ) : (
        <Component {...pageProps} />
      )}
      {draftMode && <VisualEditing />}
    </>
  )
}
